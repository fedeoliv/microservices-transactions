package samples.repositories;

import org.springframework.stereotype.Service;

@Service
public class OrderRepositoryMock implements CrudRepository {
 
    @Override
    public <T> T save(T entity) {
        return entity;
    }
}
