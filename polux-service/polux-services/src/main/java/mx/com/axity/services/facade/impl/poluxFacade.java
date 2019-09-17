package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IpoluxFacade;
import mx.com.axity.services.service.IpoluxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class poluxFacade implements IpoluxFacade {

    @Autowired
    private IpoluxService poluxService;

    public List<UserTO> getAllUsers() {
        return this.poluxService.getUsers();
    }
}
