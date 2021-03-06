/* Copyright (C) 2008-2016 University of Massachusetts Amherst.
   This file is part of "FACTORIE" (Factor graphs, Imperative, Extensible)
   http://factorie.cs.umass.edu, http://github.com/factorie
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */
package cc.factorie.tutorial
import cc.factorie.app.nlp._

/** A simple example of running an NLP document processor. */
object NLP1 extends App {
  val doc = new Document("Mr. Jones took a job at Google in New York.  He and his Australian wife moved from New South Wales on 4/1/12.")
  println(doc.string.length)
  segment.DeterministicNormalizingTokenizer.process(doc)
  println(doc.tokens.map(_.string).mkString("\n"))
}
