/*
 Copyright 2011 Software Freedom Conservancy.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.openqa.selenium.remote;

import org.openqa.selenium.WebDriverException;

/**
 * Indicates that the session was terminated by the server
 * @deprecated To be removed in 2.28, use {@link SessionNotFoundException} instead
 */
public class SessionTerminatedException extends WebDriverException {

  public SessionTerminatedException() {
    super();
  }

  public SessionTerminatedException(String message) {
    super(message);
  }

}
