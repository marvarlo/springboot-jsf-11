package com.mavlsoft.jsfboot11.managedBeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
// import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

@Named(value = "carsBean")
@ViewScoped
public class CarsManagedBean implements Serializable {

    private static final long serialVersionUID = -8268810509997231664L;
    private final static Logger LOG = LoggerFactory.getLogger(CarsManagedBean.class);

    @Getter
    private String textField;
    @Getter
    private String cardText;

    @PostConstruct
    private void init() {
        LOG.info("Post Construct Init...");
        this.reset();
    }

    public void reset() {
        LOG.info("Reset Requested!");
        this.cardText =
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed consequuntur error repudiandae "
                        + "numquam deserunt "
                        + "quisquam repellat libero asperiores earum nam nobis, culpa ratione quam perferendis esse, cupiditate "
                        + "neque quas!";
        this.textField = "";
    }

    public String getCardTitle() {
        return "Simple Card";
    }

    public void setTextField(String textField) {
        LOG.info("Receiving textField = {}", textField);
        this.cardText = textField;
        this.textField = "";
    }

}
