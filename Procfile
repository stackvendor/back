web: java $JAVA_OPTS -cp $(echo rakam/target/rakam-*-bundle/rakam-*/lib)/*: -Dstore.adapter=postgresql -Dstore.adapter.postgresql.url="${JDBC_DATABASE_URL}&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory" -Dstore.adapter.postgresql.username=${JDBC_DATABASE_USERNAME} -Dstore.adapter.postgresql.password=${JDBC_DATABASE_PASSWORD} -Dplugin.user.enabled=${ENABLE_USER_PLUGIN} -Devent-stream=server -Devent-explorer.enabled=${ENABLE_EVENT_EXPLORER_PLUGIN} -Duser.funnel-analysis.enabled=${ENABLE_FUNNEL_PLUGIN} -Duser.retention-analysis.enabled=${ENABLE_RETENTION_ANALYSIS_PLUGIN} -Dhttp.server.address=0.0.0.0:${PORT} -Dplugin.geoip.enabled=${ENABLE_GEOIP_PLUGIN} -Dstore.adapter=postgresql -Dplugin.user.storage=postgresql -Dmodule.website.mapper=${module_website_mapper}  -Dmodule.website.mapper.user-agent=${module_website_mapper_user_agent} -Dmodule.website.mapper.referrer=${module_website_mapper_referrer} -Dplugin.user.storage.identifier-column=id -Dstore.adapter.postgresql.max-connection=8 -Dplugin.geoip.database.url=${GEOIP_DATABASE_URL} -Dplugin.geoip.connection-type-database.url=${GEOIP_CONNECTION_TYPE_URL} -Dui.enable=${ui_enable} -Dautomation.enabled=${automation_enabled} -Dmail.smtp.host=127.0.0.1 -Dmail.smtp.user=test -Dplugin.user.actions=email -Dlock-key=${LOCK_KEY} -Dcompany-name=${company_name} -Dtasks.enable=${tasks_enable} -Dwebhook.enable=${webhook_enable} -Devent.stream.enabled=${event_stream_enabled}  -Devent.ab-testing.enabled=${event_ab-testing_enabled} -Dreal-time.enabled=${real-time_enabled}  -Dcustom-data-source.enabled=${ENABLE_CUSTOM_DATA_SOURCES} -Dallow-project-deletion=${ALLOW_PROJECT_DELETION} -Dplugin.user.enable-user-mapping=${plugin_user_enable_user_mapping}  -Dlog-identifier=${HEROKU_APP_NAME} -Denv=RAKAM_CONFIG org.rakam.ServiceStarter