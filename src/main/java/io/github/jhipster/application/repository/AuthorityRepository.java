package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Authority;


/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
