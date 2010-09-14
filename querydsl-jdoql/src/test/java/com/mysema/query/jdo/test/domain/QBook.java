/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.jdo.test.domain;

import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.PathMetadataFactory;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;

/**
 * QBook is a Querydsl query type for Book
 *
 */
@SuppressWarnings("serial")
public class QBook extends EntityPathBase<com.mysema.query.jdo.test.domain.Book>{

    public static final QBook book = new QBook("book");

    public final StringPath author = createString("author");

    public final StringPath description = createString("description");

    public final StringPath isbn = createString("isbn");

    public final StringPath name = createString("name");

    public final StringPath publisher = createString("publisher");

    public final DateTimePath<java.util.Date> publicationDate = createDateTime("publicationDate",java.util.Date.class);

    public final NumberPath<Integer> amount = createNumber("amount",Integer.class);

    public final NumberPath<Double> price = createNumber("price",Double.class);

    public QBook(String path) {
          this(com.mysema.query.jdo.test.domain.Book.class, path);
    }
    public QBook(Class<? extends com.mysema.query.jdo.test.domain.Book> cl, String path) {
          super(cl, PathMetadataFactory.forVariable(path));
    }
    public QBook(PathMetadata<?> metadata) {
         super(com.mysema.query.jdo.test.domain.Book.class, metadata);
    }
}