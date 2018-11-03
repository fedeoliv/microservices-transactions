package samples.repositories;

public interface CrudRepository {
    <T> T save (T entity);
}
