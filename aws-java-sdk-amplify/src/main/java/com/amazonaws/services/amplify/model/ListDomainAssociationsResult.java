/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result structure for the list domain association request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of domain associations.
     * </p>
     */
    private java.util.List<DomainAssociation> domainAssociations;
    /**
     * <p>
     * A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another request to
     * retrieve more entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of domain associations.
     * </p>
     * 
     * @return A list of domain associations.
     */

    public java.util.List<DomainAssociation> getDomainAssociations() {
        return domainAssociations;
    }

    /**
     * <p>
     * A list of domain associations.
     * </p>
     * 
     * @param domainAssociations
     *        A list of domain associations.
     */

    public void setDomainAssociations(java.util.Collection<DomainAssociation> domainAssociations) {
        if (domainAssociations == null) {
            this.domainAssociations = null;
            return;
        }

        this.domainAssociations = new java.util.ArrayList<DomainAssociation>(domainAssociations);
    }

    /**
     * <p>
     * A list of domain associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainAssociations(java.util.Collection)} or {@link #withDomainAssociations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainAssociations
     *        A list of domain associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainAssociationsResult withDomainAssociations(DomainAssociation... domainAssociations) {
        if (this.domainAssociations == null) {
            setDomainAssociations(new java.util.ArrayList<DomainAssociation>(domainAssociations.length));
        }
        for (DomainAssociation ele : domainAssociations) {
            this.domainAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of domain associations.
     * </p>
     * 
     * @param domainAssociations
     *        A list of domain associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainAssociationsResult withDomainAssociations(java.util.Collection<DomainAssociation> domainAssociations) {
        setDomainAssociations(domainAssociations);
        return this;
    }

    /**
     * <p>
     * A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another request to
     * retrieve more entries.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another
     *        request to retrieve more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another request to
     * retrieve more entries.
     * </p>
     * 
     * @return A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another
     *         request to retrieve more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another request to
     * retrieve more entries.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another
     *        request to retrieve more entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainAssociations() != null)
            sb.append("DomainAssociations: ").append(getDomainAssociations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainAssociationsResult == false)
            return false;
        ListDomainAssociationsResult other = (ListDomainAssociationsResult) obj;
        if (other.getDomainAssociations() == null ^ this.getDomainAssociations() == null)
            return false;
        if (other.getDomainAssociations() != null && other.getDomainAssociations().equals(this.getDomainAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainAssociations() == null) ? 0 : getDomainAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainAssociationsResult clone() {
        try {
            return (ListDomainAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
