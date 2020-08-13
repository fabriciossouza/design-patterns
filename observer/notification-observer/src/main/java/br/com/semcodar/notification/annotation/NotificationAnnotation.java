package br.com.semcodar.notification.annotation;

import br.com.semcodar.notification.enums.NotificationEnum;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface NotificationAnnotation {

    NotificationEnum value();
}
