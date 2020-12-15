package cn.yunlingfly.springbootflywaydb.mapper;

import cn.yunlingfly.springbootflywaydb.entity.PersonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public interface PersonMapper extends BaseMapper<PersonEntity> {
}
