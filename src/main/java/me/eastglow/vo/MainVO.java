package me.eastglow.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("mainVO")
public class MainVO {

    private int pkid;
    private String revision;
    private String author;
    private String date;
    private String message;

}
