
<ul>
<li>http://localhost:9092/greet?name=Mons</li>
<li>http://localhost:9092/countries</li>
<li>http://localhost:9092/cities</li>
</ul>


<p>@ComponentScan is used for scanning all your components those are marked as @Controller, @Service, @Repository, @Component etc…
</p>

<p>
where as @EntityScan is used to scan all your Entities those are marked @Entity for any configured JPA in your application.
</p>
<p>
@EnableJpaRepositories("my.package.base.*")
@ComponentScan(basePackages = { "my.package.base.*" })
@EntityScan("my.package.base.*")   
</p>
<hr/>
Spring Boot 3 using Jakarta EE APIs jakarta.*

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 
<hr/>
