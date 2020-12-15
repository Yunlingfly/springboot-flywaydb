package cn.yunlingfly.springbootflywaydb.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("/user")
public class UserEntity {
    @TableId
    private String id;
    private String name;
}
