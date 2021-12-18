package org.algosketch.androidtemplate.global.store

import org.algosketch.androidtemplate.data.repository.Repository

object Store {
    lateinit var repository: Lazy<Repository>
}