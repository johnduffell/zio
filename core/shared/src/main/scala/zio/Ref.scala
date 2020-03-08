/*
 * Copyright 2017-2020 John A. De Goes and the ZIO Contributors
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

package zio

object Ref extends Serializable {

  /**
   * Creates a new `Ref` with the specified value.
   *
   * @param a value of the new `Ref`
   * @tparam A type of the value
   * @return `UIO[Ref[A]]`
   */
  final def make[A](a: A): UIO[Ref[A]] = ZRef.make[Nothing, A](a)
}