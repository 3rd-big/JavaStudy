package pattern;

import java.io.Serializable;

// Transfer Object 패턴

/**
 *  Serializable
 *  서버 사이의 데이터 전송이 가능해짐
 *  원격지 서버에 데이터를 전송하거나, 파일로 객체를 저장할 경우에는 이 인터페이스를 구현
 */
public class EmployeeTo implements Serializable {
    private String empName;
    private String empID;
    private String empPhone;

    public EmployeeTo() {
        super();
    }

    public EmployeeTo(String empName, String empID, String empPhone) {
        super();
        this.empName = empName;
        this.empID = empID;
        this.empPhone = empPhone;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("empName=").append(empName)
                .append("empID=").append(empID)
                .append("empPhone=").append(empPhone);
        return  stringBuilder.toString();
    }
}
