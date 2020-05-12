package youtube;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelSystemRepository extends PagingAndSortingRepository<ChannelSystem, Long> {


}