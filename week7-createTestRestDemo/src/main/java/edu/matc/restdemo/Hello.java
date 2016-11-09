package edu.matc.restdemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Joe on 11/9/2016.
 */

@XmlRootElement(name="message")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hello {

    @XmlElement(required=true)
    private String name;

    public Hello() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
