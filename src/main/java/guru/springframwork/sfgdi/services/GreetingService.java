package guru.springframwork.sfgdi.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface GreetingService {

    String sayGreeting();
}
