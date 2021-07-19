package com.tnt.mapper;

import com.tnt.pojo.OrderRecipients;
import com.tnt.pojo.OrderRecipientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRecipientsMapper {
    int countByExample(OrderRecipientsExample example);

    int deleteByExample(OrderRecipientsExample example);

    int deleteByPrimaryKey(Integer recipientsId);

    int insert(OrderRecipients record);

    int insertSelective(OrderRecipients record);

    List<OrderRecipients> selectByExample(OrderRecipientsExample example);

    OrderRecipients selectByPrimaryKey(Integer recipientsId);

    int updateByExampleSelective(@Param("record") OrderRecipients record, @Param("example") OrderRecipientsExample example);

    int updateByExample(@Param("record") OrderRecipients record, @Param("example") OrderRecipientsExample example);

    int updateByPrimaryKeySelective(OrderRecipients record);

    int updateByPrimaryKey(OrderRecipients record);
}