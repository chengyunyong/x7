package x7.demo.repository;

import io.xream.sqli.api.BaseRepository;
import org.springframework.stereotype.Repository;
import x7.demo.bean.Pig;

@Repository
public interface PigRepository extends BaseRepository<Pig> {
}