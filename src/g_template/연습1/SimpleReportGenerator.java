/*
파일 : SimpleReportGenerator.java
생성 : 2024-11-25
내용 : ReportGenerator 상속 받아 구현 -> 모든 고객들의 정보를 출력
 */
package g_template.연습1;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {
    @Override
    protected boolean customerReportCondition(Customer customer) {
        // 모드 고객 정보를 허락
        return true;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        return String.format("고객 수 : %d\n", customers.size());
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%s : %d\n",customer.getName(),customer.getPoint());
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        return "";
    }
}
