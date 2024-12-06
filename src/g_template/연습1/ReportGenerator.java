/*
파일 : ReportGenerator.java
생성 : 2024-11-25
내용 : 다양한 report 형식의 abstract 를 만듬
 */
package g_template.연습1;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
    public String generate(List<Customer> customers) {
        // 1. 원하는 고객 정보만 가져온다.
        List<Customer> selectedCustomers = select(customers);

        // 2. 원하는 고객 정보의 헤더 저장
        String report = getReportHeader(selectedCustomers);

        // 3. 원하는 고객 정보의 보고서 생성
        for (Customer customer : selectedCustomers) {
            report += getReportForCustomer(customer);
        }

        // 4. 원하는 고객들의 기본 풋터
        report += getReportFooter(selectedCustomers);
        return report;
    }

    private List<Customer> select(List<Customer> customers) {
        List<Customer> selectedCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customerReportCondition(customer)) {
                selectedCustomers.add(customer);
            }
        }
        return selectedCustomers;
    }
    protected abstract boolean customerReportCondition(Customer customer);
    protected abstract String getReportHeader(List<Customer> customers);
    protected abstract String getReportForCustomer(Customer customer);
    protected abstract String getReportFooter(List<Customer> customers);
}
