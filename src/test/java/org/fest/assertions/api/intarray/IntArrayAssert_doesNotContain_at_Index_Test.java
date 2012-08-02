/*
 * Created on Dec 14, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api.intarray;

import static org.fest.assertions.test.TestData.someIndex;
import static org.mockito.Mockito.verify;

import org.fest.assertions.api.IntArrayAssert;
import org.fest.assertions.api.IntArrayAssertTest;
import org.fest.assertions.data.Index;

/**
 * Tests for <code>{@link IntArrayAssert#doesNotContain(int, Index)}</code>.
 * 
 * @author Alex Ruiz
 */
public class IntArrayAssert_doesNotContain_at_Index_Test extends IntArrayAssertTest {

  private final Index index = someIndex();

  @Override
  protected IntArrayAssert invoke_api_method() {
    return assertions.doesNotContain(8, index);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertDoesNotContain(getInfo(assertions), getActual(assertions), 8, index);
  }
}
