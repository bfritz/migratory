/**
 * Copyright (C) 2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nesscomputing.migratory.maven;

import com.nesscomputing.migratory.Migratory;

/**
 * Maven goal that drops all database objects.
 *
 * @aggregator true
 * @requiresProject false
 * @goal clean
 */
public class CleanMojo extends AbstractMigratoryMojo
{
    @Override
    protected void doExecute(Migratory migratory) throws Exception
    {
        migratory.dbClean(optionList);
    }
}
