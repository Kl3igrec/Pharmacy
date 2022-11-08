package repository;

public interface CRUDRepository<ID,E> {
    void add(E entity);
    void remove(ID id);
    void update(ID id,E newEntity);
    E findByID(ID id);
}
