package me.robin.wx.client.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xuanlubin on 2017/4/19.
 */
@Setter
@Getter
public class LoginUser {
    private String uuid;

    private String userAvatar;

    private String nickName;

    private String userName;

    private String skey;

    private String passTicket;

    private String uin;

    private String sid;

    private String webwxDataTicket;

    private String loginHost = "wx.qq.com";

    private JSONObject syncKey;
    private JSONObject syncCheckKey;

}
