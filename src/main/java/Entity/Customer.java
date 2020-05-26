package Entity;

import lombok.Data;

import javax.persistence.*;

/**
 *
 */

@Data
@Entity//声明实体类
@Table(name="cst_customer") //建立实体类和表的映射关系
public class Customer {
    @Id //声明当前私有属性为主键
    //IDENTITY :自增
    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略()
    @Column(name="cust_id") //指定和表中cust_id字段的映射关系
    private Long custId;
    @Column(name="cust_name") //指定和表中cust_name字段的映射关系
    private String custName;
    @Column(name="cust_source")//指定和表中cust_source字段的映射关系
    private String custSource;
    @Column(name="cust_industry")//指定和表中cust_industry字段的映射关系
    private String custIndustry;
    @Column(name="cust_level")//指定和表中cust_level字段的映射关系
    private String custLevel;
    @Column(name="cust_address")//指定和表中cust_address字段的映射关系
    private String custAddress;
    @Column(name="cust_phone")//指定和表中cust_phone字段的映射关系
    private String custPhone;

}
