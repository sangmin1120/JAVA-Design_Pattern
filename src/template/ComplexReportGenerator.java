/*
파일 : ComplexReportGenerator.java
생성 : 2024-11-25
내용 : ReportGenerator 상송받아 구현 -> 고객 조건이 달려있음
 */
package template;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

    @Override
    protected boolean customerReportCondition(Customer customer) {
        return customer.getPoint()>=100;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        return String.format("고객 수 : %d 명 입니다.\n", customers.size());
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%s : %d\n",customer.getName(),customer.getPoint());
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        // footer 총점을 출력
        int totalPoint = 0;

        for (Customer customer : customers) {
            totalPoint += customer.getPoint();
        }
        return String.format("%d\n",totalPoint);
    }
}
