package workflow.util;

import lombok.NoArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author Jin Zheng
 * @since 1.0 2022-01-04
 */
@Component
@NoArgsConstructor
public class SpringUtil implements BeanFactoryAware {
    private static BeanFactory beanFactory;


    public static <T> T getBean(Class<T> clazz) {
        return beanFactory.getBean(clazz);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        SpringUtil.beanFactory = beanFactory; // NOSONAR
    }
}
