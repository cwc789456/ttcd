package kr.co.swh.lecture.opensource.hibernate.annotation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Query {

	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory = HibernateAnnotationUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Document doc = Jsoup.connect("http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109").get();
		Elements elements = doc.select("location");

		List<String> cityNames = new ArrayList<>();

			for (Element element : elements) {
				String cityName = element.select("city").text();
				cityNames.add(cityName);

				Elements tmEfElements = element.select("tmEf");

				Elements wfElements = element.select("wf");

				Elements tmnElements = element.select("tmn");

				Elements tmxElements = element.select("tmx");

				for (int i = 0; i < tmEfElements.size(); i++) {

					Boom boom = new Boom();

					boom.setCity(cityName);
					boom.setTmEf(tmEfElements.get(i).text());
					boom.setWf(wfElements.get(i).text());
					boom.setTmn(tmnElements.get(i).text());
					boom.setTmx(tmxElements.get(i).text());
					
					System.out.println("boom:" + boom);

					session.save(boom);

			}
		}

		session.getTransaction().commit();

		System.out.println("insert complete!------------------");

		session.close();

		sessionFactory.close();
	}
}