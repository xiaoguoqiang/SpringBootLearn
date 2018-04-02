package demo.Bean;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by liqianga on 2018/4/2.
 */
@Table(name="role_account")
public class RoleAcountEntity {

    @Column(name="id")
    private int id;

    @Column(name="role_name")
    private String roleName;

    @Column(name="remark")
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RoleAcountEntity{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
