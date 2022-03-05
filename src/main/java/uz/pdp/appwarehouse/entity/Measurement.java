package uz.pdp.appwarehouse.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appwarehouse.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbsEntity {

    public Measurement(String name, boolean active) {
        super(name, active);
    }

    public Measurement() {

    }
}