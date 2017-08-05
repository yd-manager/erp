package tr.com.yd.ee.erp.ms.stock.service.material;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Ramazan Karagoz on 5.08.2017.
 */
@Service
public class MaterialServiceImpl {

    @PostConstruct
    public void init()
    {
        System.out.println("KKKKKKKAAAAAAAAARDEŞŞŞŞ SİKERLER....");
    }
}
