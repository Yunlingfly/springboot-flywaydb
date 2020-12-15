package cn.yunlingfly.springbootflywaydb.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("person")
public class PersonEntity {
    @TableId
    private String id;
    private String name;
}
