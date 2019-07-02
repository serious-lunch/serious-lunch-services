-- insert development data

-- !Ups

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


-- !Downs

DROP TABLE lunches;
DROP TABLE account_relationships;
DROP TABLE account_activations;
DROP TABLE accounts;
