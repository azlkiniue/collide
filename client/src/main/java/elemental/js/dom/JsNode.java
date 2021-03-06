/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental.js.dom;
import elemental.dom.Element;
import elemental.dom.Node;

public class JsNode extends JsElementalMixinBase  implements Node {
  protected JsNode() {}

  public final native JsNamedNodeMap getAttributes() /*-{
    return this.attributes;
  }-*/;

  public final native String getBaseURI() /*-{
    return this.baseURI;
  }-*/;

  public final native JsNodeList getChildNodes() /*-{
    return this.childNodes;
  }-*/;

  public final native JsNode getFirstChild() /*-{
    return this.firstChild;
  }-*/;

  public final native JsNode getLastChild() /*-{
    return this.lastChild;
  }-*/;

  public final native String getLocalName() /*-{
    return this.localName;
  }-*/;

  public final native String getNamespaceURI() /*-{
    return this.namespaceURI;
  }-*/;

  public final native JsNode getNextSibling() /*-{
    return this.nextSibling;
  }-*/;

  public final native String getNodeName() /*-{
    return this.nodeName;
  }-*/;

  public final native int getNodeType() /*-{
    return this.nodeType;
  }-*/;

  public final native String getNodeValue() /*-{
    return this.nodeValue;
  }-*/;

  public final native void setNodeValue(String param_nodeValue) /*-{
    this.nodeValue = param_nodeValue;
  }-*/;

  public final native JsDocument getOwnerDocument() /*-{
    return this.ownerDocument;
  }-*/;

  public final native JsElement getParentElement() /*-{
    return this.parentElement;
  }-*/;

  public final native JsNode getParentNode() /*-{
    return this.parentNode;
  }-*/;

  public final native String getPrefix() /*-{
    return this.prefix;
  }-*/;

  public final native void setPrefix(String param_prefix) /*-{
    this.prefix = param_prefix;
  }-*/;

  public final native JsNode getPreviousSibling() /*-{
    return this.previousSibling;
  }-*/;

  public final native String getTextContent() /*-{
    return this.textContent;
  }-*/;

  public final native void setTextContent(String param_textContent) /*-{
    this.textContent = param_textContent;
  }-*/;

  public final native JsNode appendChild(Node newChild) /*-{
    return this.appendChild(newChild);
  }-*/;

  public final native JsNode cloneNode(boolean deep) /*-{
    return this.cloneNode(deep);
  }-*/;

  public final native int compareDocumentPosition(Node other) /*-{
    return this.compareDocumentPosition(other);
  }-*/;

  public final native boolean contains(Node other) /*-{
    return this.contains(other);
  }-*/;

  public final native boolean hasAttributes() /*-{
    return this.hasAttributes();
  }-*/;

  public final native boolean hasChildNodes() /*-{
    return this.hasChildNodes();
  }-*/;

  public final native JsNode insertBefore(Node newChild, Node refChild) /*-{
    return this.insertBefore(newChild, refChild);
  }-*/;

  public final native boolean isDefaultNamespace(String namespaceURI) /*-{
    return this.isDefaultNamespace(namespaceURI);
  }-*/;

  public final native boolean isEqualNode(Node other) /*-{
    return this.isEqualNode(other);
  }-*/;

  public final native boolean isSameNode(Node other) /*-{
    return this.isSameNode(other);
  }-*/;

  public final native boolean isSupported(String feature, String version) /*-{
    return this.isSupported(feature, version);
  }-*/;

  public final native String lookupNamespaceURI(String prefix) /*-{
    return this.lookupNamespaceURI(prefix);
  }-*/;

  public final native String lookupPrefix(String namespaceURI) /*-{
    return this.lookupPrefix(namespaceURI);
  }-*/;

  public final native void normalize() /*-{
    this.normalize();
  }-*/;

  public final native JsNode removeChild(Node oldChild) /*-{
    return this.removeChild(oldChild);
  }-*/;

  public final native JsNode replaceChild(Node newChild, Node oldChild) /*-{
    return this.replaceChild(newChild, oldChild);
  }-*/;


  public final void removeFromParent() {
    Element parent = getParentElement();
    if (parent != null) {
      parent.removeChild(this);
    }
  }


}
