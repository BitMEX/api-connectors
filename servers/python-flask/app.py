#!/usr/bin/env python3

import connexion

if __name__ == '__main__':
    app = connexion.App(__name__, 8080,
    specification_dir='./swagger/')
    app.add_api('swagger.yaml', arguments={'title': 'REST API for the BitMEX.com trading platform.&lt;br&gt;&lt;br&gt;&lt;a href=\&quot;/app/restAPI\&quot;&gt;REST Documentation&lt;/a&gt;&lt;br&gt;&lt;a href=\&quot;/app/wsAPI\&quot;&gt;Websocket Documentation&lt;/a&gt;'})
    app.run()
