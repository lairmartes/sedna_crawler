# A Web Crawler for Sedna
Simple Web Crawler for Sedna Systems

This project goes to the domain `https://sedna.com` and create a map with the static dependencies and links.

To create a report in Console, use Maven:

`mvn compile exec:java -Dexec.mainClass="cli.SimpleCrawlerReport"`

Of course, you can redirect it to a file using shell:

`mvn compile exec:java -Dexec.mainClass="cli.SimpleCrawlerReport" > file_name.txt`

The expected file should be like this:

```aidl
********************************************************
  Web Page: https://support.sedna.com/hc/en-us
--------------------------------------------------------------
 >> Assets
--------------------------------------------------------------
 + https://static.zdassets.com/hc/assets/jquery-d5395f0b7ac5027403fc17855c46dbfc.js
 + https://support.sedna.com/cdn-cgi/bm/cv/669835187/api.js
 + https://static.zdassets.com/hc/assets/en-us.619a203666d48b12734e.js
 + https://static.zdassets.com/hc/assets/moment-f6f8513da6ab17eadada59a1a4edb536.js
 + https://sedna.zendesk.com/auth/v2/host.js
 + https://static.zdassets.com/hc/assets/hc_enduser-d2935d494d061dce4e511144fda66184.js
 + https://theme.zdassets.com/theme_assets/2227358/4ab58ce33f0aec5be1c4873c3bffd1e6ccb36e0b.svg
 + https://p23.zdassets.com/hc/theming_assets/2227358/360000177374/script.js?digest=4399489353239
--------------------------------------------------------------
 >> Links
--------------------------------------------------------------
 + https://support.sedna.com/hc/en-us/categories/360002742033-Troubleshooting
 + https://support.sedna.com/hc/en-us/requests/new
 + https://support.sedna.com/hc/en-us/articles/360004524094-Bookmarks
 + https://support.sedna.com/hc/en-us/signin
 + https://support.sedna.com/hc/en-us/categories/360001161193-Searching-in-SEDNA
 + https://support.sedna.com/hc/en-us/categories/360001161233-Activity
 + https://support.sedna.com/hc/en-us
 + https://support.sedna.com/hc/en-us/articles/360043890014-Buckets
 + https://support.sedna.com/hc/en-us/categories/360001161173-SEDNA-Announcements
 + https://status.sedna.com/
 + https://support.sedna.com/hc/en-us/articles/360019411974-Import-Send-Download-EML-Files
 + https://support.sedna.com/hc/en-us/articles/360008548793-Searching-in-SEDNA
 + https://support.sedna.com/hc/en-us/categories/360000104893-Inbox
 + https://support.sedna.com/hc/en-us/categories/360003230733-Beta-Features-
 + https://support.sedna.com/hc/en-us/categories/360001161133-Compose
 + https://www.sedna.com/privacy-notice
 + https://support.sedna.com/hc/en-us/categories/360005826013-SEDNA-Link
 + https://support.sedna.com/hc/en-us/categories/360001711434-Mobile
 + https://support.sedna.com/hc/en-us/categories/360001161213-User-Administration
 + https://support.sedna.com/hc/en-us/articles/360023894033-Custom-Queries
********************************************************
  Web Page: https://sedna.com/solutions/connected/
--------------------------------------------------------------
 >> Assets
--------------------------------------------------------------
 + https://sedna.com/wp-content/themes/oceanwp/assets/js/main.min.js?ver=2.0.8
 + https://sedna.com/wp-content/plugins/elementor-pro/assets/js/preloaded-elements-handlers.min.js?ver=3.2.2
 + https://sedna.com/wp-includes/js/jquery/jquery-migrate.min.js?ver=3.3.2
 + https://sedna.com/wp-includes/js/wp-embed.min.js?ver=5.7.2
 + https://sedna.com/wp-content/plugins/elementor/assets/js/frontend.min.js?ver=3.2.5
 + https://www.googletagmanager.com/ns.html?id=GTM-TNPCPZ3
 + https://sedna.com/wp-content/uploads/elementor/thumbs/Ha-Eun-61x61-1-p95g1p1u8xgnu9tfq5yyjaxiqqkkna2h4o2ztaeduq.png
 + https://sedna.com/wp-content/themes/oceanwp/assets/js/third/magnific-popup.min.js?ver=2.0.8
 + https://sedna.com/wp-content/plugins/elementor/assets/js/webpack.runtime.min.js?ver=3.2.5
 + https://sedna.com/wp-content/plugins/ultimate-carousel-for-elementor/classes/../js/custom-tm.js?ver=5.7.2
 + https://sedna.com/wp-content/plugins/elementor-pro/assets/js/webpack-pro.runtime.min.js?ver=3.2.2
 + https://js.hs-scripts.com/6137103.js?integration=WordPress
 + https://sedna.com/wp-content/themes/oceanwp/assets/js/third/lightbox.min.js?ver=2.0.8
 + https://sedna.com/wp-content/uploads/elementor/thumbs/Rod-61x61-1-p95g1p1u8xgnu9tfq5yyjaxiqqkkna2h4o2ztaeduq.png
 + https://sedna.com/wp-content/uploads/2021/06/Monique-Constantino.png
 + https://sedna.com/wp-content/uploads/2021/06/Link-Mobile-2x.png
 + https://sedna.com/wp-content/plugins/jet-menu/assets/public/js/vue.min.js?ver=2.6.11
 + https://sedna.com/wp-content/uploads/2021/07/Wallem-Off-Dark.svg
 + https://sedna.com/wp-content/plugins/ultimate-carousel-for-elementor/classes/../js/slick.js?ver=5.7.2
 + https://sedna.com/wp-content/uploads/2021/06/Sedna-Logo-Dark.png
 + https://sedna.com/wp-content/uploads/2021/06/Integration-1.png
 + https://sedna.com/wp-content/uploads/2021/06/Connected_d.png
 + https://sedna.com/wp-content/plugins/happy-elementor-addons/assets/js/happy-addons.min.js?ver=2.25.0
 + https://sedna.com/wp-content/plugins/jet-menu/assets/public/js/jet-menu-public-script.js?ver=2.0.9
 + https://sedna.com/wp-content/plugins/elementor-pro/assets/lib/sticky/jquery.sticky.min.js?ver=3.2.2
 + https://sedna.com/wp-content/uploads/2021/07/SGM-Off-Dark.svg
 + https://cdn.bizible.com/scripts/bizible.js
 + https://sedna.com/wp-content/plugins/elementor/assets/lib/font-awesome/js/v4-shims.min.js?ver=3.2.5
 + https://sedna.com/wp-content/plugins/ocean-extra/includes/widgets/js/mailchimp.min.js?ver=5.7.2
 + https://sedna.com/wp-content/plugins/elementor/assets/lib/waypoints/waypoints.min.js?ver=4.0.2
 + https://sedna.com/wp-content/uploads/2021/06/Link.png
 + https://sedna.com/wp-content/plugins/jet-menu/assets/public/js/jet-menu-widgets-scripts.js?ver=2.0.9
 + https://sedna.com/wp-content/uploads/elementor/thumbs/Sture-61x61-1-p95g1p1u8xgnu9tfq5yyjaxiqqkkna2h4o2ztaeduq.png
 + https://sedna.com/wp-content/plugins/elementor/assets/lib/dialog/dialog.min.js?ver=4.8.1
 + https://sedna.com/wp-content/uploads/2021/06/API-Mobile2x.png
 + https://sedna.com/wp-content/uploads/2021/07/Bunge-Dark.svg
 + https://sedna.com/wp-content/uploads/2021/06/Integrations-Mobile-2x.png
 + https://sedna.com/wp-content/plugins/elementor/assets/lib/share-link/share-link.min.js?ver=3.2.5
 + https://sedna.com/wp-includes/js/jquery/ui/core.min.js?ver=1.12.1
 + https://sedna.com/wp-content/uploads/2021/07/Norden-Dark.svg
 + https://sedna.com/wp-content/plugins/elementor-pro/assets/js/frontend.min.js?ver=3.2.2
 + https://sedna.com/wp-content/uploads/2021/06/Connected-Hero-Mobile-2x.png
 + https://sedna.com/wp-content/uploads/2021/07/Wetern-Bulk-Dark.svg
 + https://sedna.com/wp-content/uploads/2021/07/Oldendorff-Dark.svg
 + https://sedna.com/wp-content/plugins/elementor/assets/js/preloaded-modules.min.js?ver=3.2.5
 + https://sedna.com/wp-content/uploads/2021/06/Monson-Logo.png
 + https://sedna.com/wp-content/uploads/2021/06/Workflows.png
 + https://sedna.com/wp-content/uploads/2021/07/Sedna-Logo-Dark.svg
 + https://sedna.com/wp-content/plugins/elementor/assets/js/frontend-modules.min.js?ver=3.2.5
 + https://sedna.com/wp-content/plugins/elementor/assets/lib/swiper/swiper.min.js?ver=5.3.6
 + https://sedna.com/wp-includes/js/imagesloaded.min.js?ver=4.1.4
 + https://sedna.com/wp-includes/js/jquery/jquery.min.js?ver=3.5.1
 + https://sedna.com/wp-content/plugins/happy-elementor-addons/assets/vendor/jquery-match-height/jquery.matchHeight-min.js?ver=2.25.0
 + https://sedna.com/wp-content/uploads/2021/07/Glencore-Dark.svg
 + https://sedna.com/wp-content/uploads/2021/07/Cheniere-Dark.svg
--------------------------------------------------------------
 >> Links
--------------------------------------------------------------
 + https://sedna.com/company/leadership-team/
 + https://sedna.com/company/leadership/
 + https://sedna.com/contact/
 + https://sedna.com/solutions/connection/#unlock
 + https://support.sedna.com/hc/en-us
 + https://sedna.com/solutions/
 + https://sedna.com/privacy-notice/
 + https://sedna.com/solutions/connection/#
 + https://sedna.com/solutions/enterprise-collaboration/
 + https://sedna.com/request-demo/
 + https://sedna.com/solutions/connection/#swap
 + https://sedna.com/product-overview/
 + https://sedna.com/solutions/connection/
 + https://sedna.com/solutions/connection/#main
 + https://sedna.com/features/
 + https://sedna.com/solutions/intelligence/
 + https://sedna.com/solutions/connection/#oneplace
 + https://support.sedna.com/
 + https://sedna.com/
 + https://press.sedna.com/
 + https://sedna.com/company/
 + https://sedna.com/terms-of-service/
 + https://sedna.com/solutions/speed/
 + https://sedna.com/solutions/collaboration/
********************************************************
```