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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceptInboundCrossClusterSearchConnectionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceptInboundCrossClusterSearchConnectionRequestMarshaller {

    private static final MarshallingInfo<String> CROSSCLUSTERSEARCHCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ConnectionId").build();

    private static final AcceptInboundCrossClusterSearchConnectionRequestMarshaller instance = new AcceptInboundCrossClusterSearchConnectionRequestMarshaller();

    public static AcceptInboundCrossClusterSearchConnectionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceptInboundCrossClusterSearchConnectionRequest acceptInboundCrossClusterSearchConnectionRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (acceptInboundCrossClusterSearchConnectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceptInboundCrossClusterSearchConnectionRequest.getCrossClusterSearchConnectionId(),
                    CROSSCLUSTERSEARCHCONNECTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
