/*
 *
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 *
 */
package org.jnosql.diana.api.document.query;

import org.jnosql.diana.api.document.DocumentCondition;
import org.jnosql.diana.api.document.DocumentDeleteQuery;

/**
 * The Document Where whose define the condition in the delete query.
 */
public interface DocumentDeleteWhere {

    /**
     * Appends a new condition in the select using {@link DocumentCondition#and(DocumentCondition)}
     *
     * @param condition a condition to be added
     * @return the same {@link DocumentDeleteWhere} with the condition appended
     * @throws NullPointerException when condition is null
     */
    DocumentDeleteWhere and(DocumentCondition condition) throws NullPointerException;

    /**
     * Appends a new condition in the select using {@link DocumentCondition#or(DocumentCondition)}
     *
     * @param condition a condition to be added
     * @return the same {@link DocumentDeleteWhere} with the condition appended
     * @throws NullPointerException when condition is null
     */
    DocumentDeleteWhere or(DocumentCondition condition) throws NullPointerException;

    /**
     * Creates a new instance of {@link DocumentDeleteQuery}
     *
     * @return a new {@link DocumentDeleteQuery} instance
     */
    DocumentDeleteQuery build();

}
