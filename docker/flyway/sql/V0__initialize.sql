SET NAMES utf8mb4 ;
SET character_set_client = utf8mb4 ;

CREATE TABLE `accounts` (
                            `account_id` bigint(20) NOT NULL AUTO_INCREMENT,
                            `account_name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
                            `email_address` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                            `password_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                            `created_at` datetime NOT NULL,
                            `updated_at` datetime NOT NULL,
                            PRIMARY KEY (`account_id`),
                            UNIQUE KEY `index_accounts_on_account_name` (`account_name`),
                            UNIQUE KEY `index_accounts_on_email_address` (`email_address`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_activations` (
                                       `account_id` bigint(20) NOT NULL,
                                       `activation_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                                       `activated` tinyint(1) NOT NULL DEFAULT '0',
                                       `created_at` datetime NOT NULL,
                                       `updated_at` datetime NOT NULL,
                                       UNIQUE KEY `index_account_activations_on_account_id` (`account_id`),
                                       KEY `index_account_activations_on_activated` (`activated`),
                                       CONSTRAINT `fk_rails_d7d52ac162` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_cookies` (
                                   `account_id` bigint(20) NOT NULL,
                                   `remember_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                                   `created_at` datetime NOT NULL,
                                   `updated_at` datetime NOT NULL,
                                   UNIQUE KEY `index_account_cookies_on_account_id` (`account_id`),
                                   CONSTRAINT `fk_rails_a09f491abe` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_relationships` (
                                         `account_relationship_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                         `follower_account_id` bigint(20) NOT NULL,
                                         `followed_account_id` bigint(20) NOT NULL,
                                         `created_at` datetime NOT NULL,
                                         `updated_at` datetime NOT NULL,
                                         PRIMARY KEY (`account_relationship_id`),
                                         UNIQUE KEY `index_account_relationships_on_follower_and_followed` (`follower_account_id`,`followed_account_id`),
                                         UNIQUE KEY `index_account_relationships_on_followed_and_follower` (`followed_account_id`,`follower_account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_resets` (
                                  `account_id` bigint(20) NOT NULL,
                                  `reset_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                                  `created_at` datetime NOT NULL,
                                  `updated_at` datetime NOT NULL,
                                  UNIQUE KEY `index_account_resets_on_account_id` (`account_id`),
                                  CONSTRAINT `fk_rails_7312fec1e5` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `lunches` (
                           `lunch_id` bigint(20) NOT NULL AUTO_INCREMENT,
                           `account_id` bigint(20) NOT NULL,
                           `lunch_date` date NOT NULL,
                           `comment` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
                           `created_at` datetime NOT NULL,
                           `updated_at` datetime NOT NULL,
                           PRIMARY KEY (`lunch_id`),
                           KEY `index_lunches_on_account_id_and_lunch_date` (`account_id`,`lunch_date`),
                           KEY `index_lunches_on_account_id_and_created_at` (`account_id`,`created_at`),
                           CONSTRAINT `fk_rails_38eef2a231` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

INSERT INTO `accounts` (`account_id`, `account_name`, `email_address`, `password_digest`, `created_at`, `updated_at`) VALUES
(1, 'foo', 'foo@example.com', '$2a$10$W/ddZ.N7db0O8xdljE70F.hhWcxainSDTGbDCV/bJuxv.ku.Mz6nq', '2019-05-26 03:40:57', '2019-05-26 03:40:57'),
(2, 'bar', 'bar@example.com', '$2a$10$gQKve8lQqggP6yxqCOV8MuTy22VO01egg6lyOGFTpXTsOz2Q1dfYq', '2019-05-26 03:40:57', '2019-05-26 03:40:57');

INSERT INTO `account_activations` (`account_id`, `activation_digest`, `activated`, `created_at`, `updated_at`) VALUES
(1, '', TRUE, '2019-05-26 03:40:57', '2019-05-26 03:40:57'),
(2, '', TRUE, '2019-05-26 03:40:57', '2019-05-26 03:40:57');

INSERT INTO `account_relationships` (`follower_account_id`, `followed_account_id`, `created_at`, `updated_at`) VALUES
(1, 2, '2019-05-26 03:40:57', '2019-05-26 03:40:57');

INSERT INTO `lunches` (`lunch_id`, `account_id`, `lunch_date`, `comment`, `created_at`, `updated_at`) VALUES
(1, 1, '2018-03-09', 'excellent', '2019-05-26 03:40:57', '2019-05-26 03:40:57'),
(2, 2, '2018-03-09', 'bad', '2019-05-26 03:40:57', '2019-05-26 03:40:57'),
(3, 1, '2018-03-08', 'good', '2019-05-26 03:40:57', '2019-05-26 03:40:57');
