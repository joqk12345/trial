package com.horvan.trial.entity;

import com.horvan.trial.Constant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = Constant.TABLE_HOTWORD)
public class HotWord {
    /**
     * 指定id为主键，并设置为自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    // 案号
    private String number;
    // 热词名称
    private String name;
    // 类型
    private int type;
//      状态
    private int state;
//// 使用状态 0为未使用，1 为使用
//    private  int useState;
//备注
    private String message;

    public HotWord() {
    }

    public HotWord(String number, String name, int type, int state, String message) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.state = state;
        this.message = message;
    }

    /**
     * Gets id.  热词id
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets number.
     * 案号
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets name. 热词名称
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets type.
     * 类型
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Gets state.
     * 状态
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * Gets message.
     * 备注
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }
//    public int getUseState() {
//        return useState;
//    }
//    public void setUseState(int useState) {
//        this.useState = useState;
//    }
}
