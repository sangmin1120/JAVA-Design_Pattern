/*
파일 : Customer.java
생성 : 2024-11-25
내용 : 고객 정보 이름,점수
 */
package g_template.연습1;

public class Customer {
    private String name;
    private int point;

    public Customer(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
