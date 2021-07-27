package jp.kobe_u.cs.daikibo.tsubuyaki.dto;

import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;
import lombok.Data;

@Data
public class TsubuyakiForm {
    String name; //投稿者
    String comment; //コメント
}
