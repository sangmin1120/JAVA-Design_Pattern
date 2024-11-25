package template;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. 고객 배열 추가
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("홍길동",150));
        customers.add(new Customer("우수한",350));
        customers.add(new Customer("부족한",50));
        customers.add(new Customer("훌륭한",450));
        customers.add(new Customer("최고의",550));

        // 2. SimpleReportGenerator 사용해 보고서 생성
        ReportGenerator simpleGenerator = new SimpleReportGenerator();
        System.out.println(simpleGenerator.generate(customers));

        // 3. ComplexReportGenerator 사용해 보고서 생성
        ReportGenerator complexGenerator = new ComplexReportGenerator();
        System.out.println(complexGenerator.generate(customers));
    }
}
