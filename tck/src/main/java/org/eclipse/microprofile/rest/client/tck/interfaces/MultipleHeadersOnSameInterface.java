/*
 * Copyright 2018, 2021 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.rest.client.tck.interfaces;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Response;

@ClientHeaderParam(name = "IdenticalHeader", value = "{computeMethod}")
@ClientHeaderParam(name = "IdenticalHeader", value = "someValue")
public interface MultipleHeadersOnSameInterface {

    default String computeMethod(String headerName) {
        return "someOtherValue";
    }

    @GET
    Response get();
}
