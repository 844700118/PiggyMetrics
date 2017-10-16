FROM mongo:3


ADD init.sh /init.sh
ADD ./dump /

RUN \
    chmod +x /init.sh && \
    apt-get -o Acquire::http::proxy="http://192.168.162.228:801/" update && apt-get dist-upgarde -y && \
    apt-get install psmisc -y -q -o Acquire::http::proxy="http://192.168.162.228:801/" && \
    apt-get autoremove -y && apt-get clean && \
    rm -rf /var/cache/* && rm -rf /var/lib/apt/lists/*

RUN \
    chmod +x /init.sh && \
    apt-get -o Acquire::http::proxy="http://192.168.162.228:801/" update && apt-get dist-upgrade -y && \
    apt-get install psmisc -y -q -o Acquire::http::proxy="http://192.168.162.228:801/" && \
    apt-get autoremove -y && apt-get clean && \
    rm -rf /var/cache/* && rm -rf /var/lib/apt/lists/*

ENTRYPOINT ["/init.sh"]

