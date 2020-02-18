package com.gojek.trendingrepos.domain.repository

import com.gojek.trendingrepos.domain.models.TrendingRepo
import kotlinx.coroutines.flow.Flow

interface ITrendingRepoSearchRepository {
    suspend fun searchTrendingRepositories(forceRefresh: Boolean): Flow<List<TrendingRepo>>
}