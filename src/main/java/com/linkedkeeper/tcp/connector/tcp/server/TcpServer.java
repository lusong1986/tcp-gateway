/*
 * Copyright (c) 2016, LinkedKeeper
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * - Neither the name of LinkedKeeper nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.linkedkeeper.tcp.connector.tcp.server;

import com.linkedkeeper.tcp.exception.PushException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by frank@linkedkeeper.com on 2017/2/25.
 */
public class TcpServer {

    private final static Logger logger = LoggerFactory.getLogger(TcpServer.class);

    private int port;

    private static int i = 0;

    private static final PushException NOT_CONNECTED_EXCEPTION = new PushException();

    public void init() throws Exception {
        boolean flag = Boolean.FALSE;
        logger.info("start tcp server ...");

        if (i > 0)
            throw new Exception("start tcp server failure.");

        i++;
    }


    public void shutdown() {

    }


    //------------------ set && get --------------------

    public void setPort(int port) {
        this.port = port;
    }
}
