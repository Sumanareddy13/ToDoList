package SpringProject.ToDoList.repository;

import SpringProject.ToDoList.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
