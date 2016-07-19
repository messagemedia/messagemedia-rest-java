/*
 * Copyright 2014-2016 Message4U Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.messagemedia.restapi.client.v1;

import java.io.Closeable;

/**
 * Certain edge cases make it necessary to execute a REST API call under a context. Normally you should not need to use it.
 * <p/>
 * A Context is always bound to the thread that created it.
 */
public interface Context extends Closeable {

    /**
     * Requests should be performed under this Username.
     *
     * @return - the Username or null if it has not been set
     */
    String getUsername();

    /**
     * Requests should be performed under this Account.
     *
     * @return - the Account or null if it has not been set
     */
    String getAccount();

    /**
     * Closes the context.
     */
    void close();
}
